public abstract class NotificacaoDecorator implements INotificacao {

    INotificacao not;
    public NotificacaoDecorator(INotificacao notificacao){
        this.not = notificacao;
    }
    @Override
    public void enviar(String msg){
        this.not.enviar(msg);
    }


}
