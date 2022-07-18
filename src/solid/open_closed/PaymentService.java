package solid.open_closed;

public class PaymentService {
    private IPaymentMethod paymentMethod;

    public PaymentService(IPaymentMethod paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    public void pay(){
        paymentMethod.processPayment();
    }
}
