1. We can mix @qualifier and @primary
2. But qualifier has higher priority
3. Use @qualifier - recommended
4. We can annotate our implementation class HdfcCreditCard as @Primary
5. We don't want to use qualifier in controller. The below will work bcz we marked as @primary
    @Autowired
    public MyController(CreditCard creditCard){
        this.creditCard = creditCard;
    }
6. Multiple @primary will create a exception
7. @lazy will not create a bean unless it is instantiated
8. @lazy - create objects when only needed



