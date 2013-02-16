package sbdemo.modelviewerapp



import org.junit.*
import grails.test.mixin.*

@TestFor(StandingController)
@Mock(Standing)
class StandingControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/standing/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.standingInstanceList.size() == 0
        assert model.standingInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.standingInstance != null
    }

    void testSave() {
        controller.save()

        assert model.standingInstance != null
        assert view == '/standing/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/standing/show/1'
        assert controller.flash.message != null
        assert Standing.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/standing/list'

        populateValidParams(params)
        def standing = new Standing(params)

        assert standing.save() != null

        params.id = standing.id

        def model = controller.show()

        assert model.standingInstance == standing
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/standing/list'

        populateValidParams(params)
        def standing = new Standing(params)

        assert standing.save() != null

        params.id = standing.id

        def model = controller.edit()

        assert model.standingInstance == standing
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/standing/list'

        response.reset()

        populateValidParams(params)
        def standing = new Standing(params)

        assert standing.save() != null

        // test invalid parameters in update
        params.id = standing.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/standing/edit"
        assert model.standingInstance != null

        standing.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/standing/show/$standing.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        standing.clearErrors()

        populateValidParams(params)
        params.id = standing.id
        params.version = -1
        controller.update()

        assert view == "/standing/edit"
        assert model.standingInstance != null
        assert model.standingInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/standing/list'

        response.reset()

        populateValidParams(params)
        def standing = new Standing(params)

        assert standing.save() != null
        assert Standing.count() == 1

        params.id = standing.id

        controller.delete()

        assert Standing.count() == 0
        assert Standing.get(standing.id) == null
        assert response.redirectedUrl == '/standing/list'
    }
}
