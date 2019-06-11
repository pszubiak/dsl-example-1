// Creates or updates a free style job.
job("hello-world") {

    // Allows to parameterize the job.
    parameters {

        // Defines a simple text parameter, where users can enter a string value.
        stringParam('response', 'Hello Jenkins!', 'Worlds response')
    }

    // Adds build triggers to the job.
    triggers {

        // Triggers the job based on regular intervals.
        cron('@daily')
    }

    // Adds build steps to the jobs.
    steps {

        // Runs a shell script.
        shell('echo Hello World!')
    }

    // Adds build steps to the jobs.
    steps {

        // Runs a shell script.
        shell('echo Hello $response')
    }


}