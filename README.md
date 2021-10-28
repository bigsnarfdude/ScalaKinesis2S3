ScalaKinesis2S3
===============

Application for copying Amazon Kinesis data to S3.

## Usage

1. `git clone https://github.com/bigsnarfdude/ScalaKinesis2S3`
2. Configure your application (start with the template `config.properties`)
3. Configure AWS access credentials:
    1. Locally, set either
        1. the environment variables `AWS_ACCESS_KEY_ID=xxx` and `AWS_SECRET_KEY=yyy`
        2. or the JVM options `-Daws.accessKeyId=xxx` and `-D=aws.secretKey=yyy`
    2. On Amazon EC2
        1. No configuration needed if you start the server instance with a proper IAM role (highly recommended!)
4. Run the app: `sbt run`

## Development

Checkout the source using `amazon-kinesis-connectors` module provided by awslabs 


### Building

`sbt package`

## Notes

Licensed under the MIT license.

Uses the [Amazon Kinesis Client Library](https://github.com/awslabs/amazon-kinesis-client),
the [Amazon Kinesis Connector Library](https://github.com/awslabs/amazon-kinesis-connectors)
and the [AWS SDK for Java](https://github.com/aws/aws-sdk-java). These are also embedded in
the runnable jar. See [the AWS licensing terms](AMAZON_SOFTWARE_LICENSE.txt).

## Rationale

The [Kinesis Connector sample code](https://github.com/awslabs/amazon-kinesis-connectors/tree/master/src/main/samples)
contains code for copying Kinesis data to S3, but is not easily reusable. This application
contains the minimal code for the copying process and nothing else.

.
