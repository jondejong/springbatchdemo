import sbdemo.grails.*

beans {
    xmlns batch:'http://www.springframework.org/schema/batch'

    batch.job(id: 'simpleJob') {
        batch.step(id: 'logStart') {
            batch.tasklet(ref: 'printStartMessage')
        }
    }

    printStartMessage(PrintStartMessageTasklet) { bean ->
        bean.autowire = 'byName'
    }
}
