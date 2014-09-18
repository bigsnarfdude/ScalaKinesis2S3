import java.io.FileReader
import java.util.Properties

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain
import com.amazonaws.services.kinesis.connectors.{KinesisConnectorConfiguration, KinesisConnectorExecutorBase, KinesisConnectorRecordProcessorFactory}


class Kinesis2S3() extends KinesisConnectorExecutorBase[Array[Byte], Array[Byte]] {

  val properties = getProperties()

  private def getProperties(): Properties = {
    val properties = new Properties()
    val reader = new FileReader("config.properties")
    try {
      properties.load(reader)
    } finally {
      reader.close()
    }
    properties
  }

  private val configuration = new KinesisConnectorConfiguration(properties, new DefaultAWSCredentialsProviderChain())

  initialize(configuration)

  override def getKinesisConnectorRecordProcessorFactory(): KinesisConnectorRecordProcessorFactory[Array[Byte], Array[Byte]] = {
    new KinesisConnectorRecordProcessorFactory(new S3Pipeline(), configuration)
  }
}
