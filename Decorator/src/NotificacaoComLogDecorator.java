public class NotificacaoComLogDecorator extends NotificacaoDecorator {
    public NotificacaoComLogDecorator(INotificacao notificacao) {
        super(notificacao);
    }

    public void inserirLog(String log){
        System.out.println("Enviando notificação com log: " + log);
    }

    @Override
    public void enviar(String msg){
        super.enviar(msg);
        this.inserirLog(msg);
    }
}
