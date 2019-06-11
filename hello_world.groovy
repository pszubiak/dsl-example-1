// Creates or updates a free style job.
job("hello-world") {

    // Adds build triggers to the job.
    triggers {

        // Triggers the job based on regular intervals.
        cron("@daily")
    }

    // Adds build steps to the jobs.
    steps {

        // Runs a shell script.
        shell('echo Hello World!')
    }
}