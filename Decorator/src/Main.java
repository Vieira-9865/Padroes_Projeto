public class Main {
    public static void main(String[] args) {

        INotificacao notificacaoSimples = new NotificacaoSimplesDecorator() {

        };
        notificacaoSimples.enviar("Mensagem simples");


        INotificacao notificacaoPersonalizada = new  NotificacaoComImagemDecorator(new NotificacaoComSomDecorator(new NotificacaoSimplesDecorator()) {
        });
        notificacaoPersonalizada.enviar("Mensagem alterada com as funções");
    }
}