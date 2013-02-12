package sbdemo.grails

import org.springframework.batch.core.*
import org.springframework.batch.core.scope.context.*
import org.springframework.batch.core.step.tasklet.*
import org.springframework.batch.repeat.*

class PrintStartMessageTasklet implements Tasklet {
    
    def loggingService

    RepeatStatus execute(StepContribution stepContribution, ChunkContext chunkContext) {
        loggingService.logMessage("Start Job: ${chunkContext.stepContext.jobName}")
        loggingService.logMessage("Job Params: ${chunkContext.stepContext.jobParameters}")
        loggingService.logMessage("Job Exec Ctx: ${chunkContext.stepContext.jobExecutionContext}")
        loggingService.logMessage("Step Exec Ctx: ${chunkContext.stepContext.stepExecutionContext}")
        return RepeatStatus.FINISHED
    }
}
