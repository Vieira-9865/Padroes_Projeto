public class NotificacaoComSomDecorator extends NotificacaoDecorator{


    public NotificacaoComSomDecorator(INotificacao notificacao) {
        super(notificacao);
    }

    public void inserirSom(String som){
        System.out.println("Enviando notificação com som: " + som);
    }

    @Override
    public void enviar(String msg){
        super.enviar(msg);
        this.inserirSom(msg);
    }
}
