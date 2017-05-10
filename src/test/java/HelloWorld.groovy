import spock.lang.Specification

/**
 * Created by jlarrieux on 5/10/2017.
 */
class HelloWorld extends Specification {


    def "scenario 1"() {
        given: "An integer with value 5"
        def i = 5

        when: "This integer is multiplied by 2"
        i = i * 2


        then: "the final value is 10"

        assert i != 5
        i == 10
    }


    def 'data-driven test'() {
        expect:
        x * y == z

        where:
        x | y | z
        3 | 2 | 6
        1 | 2 | 2
        1 | 6 | 6
    }


    def 'data-driven test 2'() {
        expect:
        x + y == z

        where:
        x << [3, 19, 71]
        y << [4, 23, 12]
        z << [7, 42, 83]

    }


}
