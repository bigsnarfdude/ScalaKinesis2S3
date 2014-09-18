import com.amazonaws.services.kinesis.connectors.KinesisConnectorConfiguration
import com.amazonaws.services.kinesis.connectors.impl.{AllPassFilter, BasicMemoryBuffer}
import com.amazonaws.services.kinesis.connectors.interfaces.{IBuffer, IEmitter, IFilter, IKinesisConnectorPipeline, ITransformer}
import com.amazonaws.services.kinesis.connectors.s3.S3Emitter

class S3Pipeline extends IKinesisConnectorPipeline[Array[Byte], Array[Byte]] {

  override def getEmitter(configuration: KinesisConnectorConfiguration): IEmitter[Array[Byte]] = new S3Emitter(configuration)

  override def getBuffer(configuration: KinesisConnectorConfiguration): IBuffer[Array[Byte]] = new BasicMemoryBuffer(configuration)

  override def getTransformer(configuration: KinesisConnectorConfiguration): ITransformer[Array[Byte], Array[Byte]] = {
    new ByteArrayNoopTransformer()
  }

  override def getFilter(configuration: KinesisConnectorConfiguration): IFilter[Array[Byte]] = new AllPassFilter()
}
