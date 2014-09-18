

object KinesisToS3 {

  def main(args: Array[String]) {
    val app = new Kinesis2S3()
    app.run()
  }
}
