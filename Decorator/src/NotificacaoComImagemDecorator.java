public class NotificacaoComImagemDecorator extends NotificacaoDecorator {
    public NotificacaoComImagemDecorator(INotificacao notificacao) {
        super(notificacao);
    }

    public void inserirImg(String img){
        System.out.println("Enviando notificação com imagem: " + img);
    }

    @Override
    public void enviar(String msg){
        super.enviar(msg);
        this.inserirImg(msg);
    }
}
