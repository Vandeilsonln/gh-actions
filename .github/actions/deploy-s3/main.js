const core = require('@actions/core');
const github = require('@actions/github');

function run() {
    core.notice('Hello world. This is my custom JS action!')
}

run();