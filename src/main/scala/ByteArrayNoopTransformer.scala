import com.amazonaws.services.kinesis.connectors.interfaces.ITransformer
import com.amazonaws.services.kinesis.model.Record

class ByteArrayNoopTransformer extends ITransformer[Array[Byte], Array[Byte]] {

  override def toClass(record: Record): Array[Byte] = record.getData.array()

  override def fromClass(record: Array[Byte]): Array[Byte] = record
}
