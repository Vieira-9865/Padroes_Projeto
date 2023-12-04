public abstract class NotificacaoComPrioridadeDecorator extends NotificacaoDecorator {
    public NotificacaoComPrioridadeDecorator(INotificacao notificacao) {
        super(notificacao);
    }

    public void inserirPrioridade(String prioridade){
        System.out.println("Enviando notificação com prioridade: " + prioridade);
    }

    @Override
    public void enviar(String msg){
        super.enviar(msg);
        this.inserirPrioridade(msg);
    }
}