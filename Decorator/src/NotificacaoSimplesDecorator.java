public class NotificacaoSimplesDecorator implements INotificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação simples: " + mensagem);
    }
}
