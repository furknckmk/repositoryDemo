public class Validator {
    public <T extends IEntity>void validate(T entity){

        Validator validator = new Validator();
        Customer customer=new Customer();
        CustomerDal customerDal=new CustomerDal();
        validator.validate(customer);

    }


}
