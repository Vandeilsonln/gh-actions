const core = require('@actions/core');
const github = require('@actions/github');

function run() {
    core.notice('Hello world. This is my custom JS action!')

    // 1 - Get Input Values

    const bucket = core.getInput('bucket', {required: true});
    const bucketRegion = core.getInput('bucket-region', {required: true});
    const distFolder = core.getInput('dist-folder', {required: true});

    // 2 - Upload Files
    const s3Uri = `s3://${bucket}`;
    const AWS_ACCESS_KEY_ID = 'AKIA6K32I2NLBUVT2UPA';
    const password = 'WDgpSCYnet0IGRep7PcMYzC1yXr7p6QxcFnkADUF'
    exec.exec(`aws s3 sync ${distFolder} ${s3Uri} --region ${bucketRegion}`);
}

run();