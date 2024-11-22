package java17.ex01;

import java.util.List;

import org.junit.Test;

import java17.data.Data;
import java17.data.Person;


/**
 * Exercice 01 - Méthode par défaut
 */
public class Method_01_Test {

    // tag::IDao[]
    interface IDao {
        List<Person> findAll();

        int sumAge();
    }
    // end::IDao[]

    class DaoA implements IDao {

        List<Person> people = Data.buildPersonList(20);

        @Override
        public List<Person> findAll() {
            return people;
        }

        @Override
        public int sumAge() {
            int ages = 0;

            for (Person person : people){
                ages+= person.getAge();
            }
            return ages;
        }
    }

    class DaoB implements IDao {

        List<Person> people = Data.buildPersonList(100);

        @Override
        public List<Person> findAll() {
            return people;
        }

        @Override
        public int sumAge() {
            int ages = 0;

            for (Person person : people){
                ages+= person.getAge();
            }
            return ages;
        }
    }

    @Test
    public void test_daoA_sumAge() throws Exception {

        DaoA daoA = new DaoA();

        int result = daoA.sumAge();

        assert result == 210;
    }

    @Test
    public void test_daoB_sumAge() throws Exception {

        DaoB daoB = new DaoB();

        int result = daoB.sumAge();

        assert result == 5050;

    }
}
