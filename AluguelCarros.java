import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class AluguelCarros extends JFrame implements ActionListener {

    public static void main(String[] args) {
        AluguelCarros aluguel = new AluguelCarros();
        aluguel.alugaCarro();
    }

    private JButton btnSalvar;

    private void alugaCarro() {
        Container janela = getContentPane();
        setLayout(null);

        //dados do cliente:

        JLabel labelMsgAluguel = new JLabel("Dados do Cliente: ");
        labelMsgAluguel.setBounds(50,20,200,20);

        JLabel labelNome = new JLabel("Nome: ");
        JLabel labelCpf = new JLabel("CPF: ");
        JLabel labelTel = new JLabel("Telefone: ");
        labelNome.setBounds(50,60,300,20);
        labelCpf.setBounds(50,90,100,20);
        labelTel.setBounds(50,120,100,20);


        //dados do carro:
        JLabel labelMsgCarro = new JLabel("Dados do carro: ");
        labelMsgCarro.setBounds(50,150,100,20);

        JLabel nomeCarro = new JLabel("Nome: ");
        JLabel placaCarro = new JLabel("Placa: ");
        JLabel anoCarro = new JLabel("Ano");
        JLabel locacaoCarro = new JLabel("Data de Locação: ");
        JLabel entregaCarro = new JLabel("Data da Entrega: ");
        nomeCarro.setBounds(50,180,200,20);
        placaCarro.setBounds(50,210,200,20);
        anoCarro.setBounds(50,240,50,20);
        locacaoCarro.setBounds(50,270,200,20);
        entregaCarro.setBounds(50,300,200,20);


        //mascaras
        MaskFormatter mascaraNome = null;
        MaskFormatter mascaraCpf = null;
        MaskFormatter mascaraTel = null;
        MaskFormatter mascaraNomeC = null;
        MaskFormatter mascaraPlaca = null;
        MaskFormatter mascaraAno = null;
        MaskFormatter mascaraLocacao = null;
        MaskFormatter mascaraEntregaC = null;

        try {
            mascaraNome = new MaskFormatter("*********************************");
            mascaraCpf = new MaskFormatter("#########-##");
            mascaraTel = new MaskFormatter("(##)#####-####");
            mascaraNomeC = new MaskFormatter("*************************");
            mascaraPlaca = new MaskFormatter("UUU-####");
            mascaraAno = new MaskFormatter("####");
            mascaraLocacao = new MaskFormatter("##/##/####");
            mascaraEntregaC = new MaskFormatter("##/##/####");


        } catch (ParseException excp) {
            System.err.println("Erro na formatação: " + excp.getMessage());
            System.exit(-1);
        }

        //seta as mascaras nos objetos JFormattedTextField
        JFormattedTextField jFormattedTextNome = new JFormattedTextField(mascaraNome);
        JFormattedTextField jFormattedTextCpf = new JFormattedTextField(mascaraCpf);
        JFormattedTextField jFormattedTextTel = new JFormattedTextField(mascaraTel);
        JFormattedTextField jFormattedTextNomeC = new JFormattedTextField(mascaraNomeC);
        JFormattedTextField jFormattedTextPlaca = new JFormattedTextField(mascaraPlaca);
        JFormattedTextField jFormattedTextAno = new JFormattedTextField(mascaraAno);
        JFormattedTextField jFormattedTextLocacao = new JFormattedTextField(mascaraLocacao);
        JFormattedTextField jFormattedTextEntregaC = new JFormattedTextField(mascaraEntregaC);

        jFormattedTextNome.setBounds(150,60,300,20);
        jFormattedTextCpf.setBounds(150,90,100,20);
        jFormattedTextTel.setBounds(150,120,100,20);

        jFormattedTextNomeC.setBounds(150,180,200,20);
        jFormattedTextPlaca.setBounds(150,210,100,20);
        jFormattedTextAno.setBounds(150,240,50,20);
        jFormattedTextLocacao.setBounds(170,270,100,20);
        jFormattedTextEntregaC.setBounds(170,300,100,20);


        //adiciona os rótulos
        janela.add(labelMsgAluguel);

        janela.add(labelNome);
        janela.add(labelCpf);
        janela.add(labelTel);

        janela.add(labelMsgCarro);
        janela.add(nomeCarro);
        janela.add(placaCarro);
        janela.add(anoCarro);
        janela.add(locacaoCarro);
        janela.add(entregaCarro);

        //adiciona as "caixinhas"
        janela.add(jFormattedTextNome);
        janela.add(jFormattedTextTel);
        janela.add(jFormattedTextCpf);

        janela.add(jFormattedTextNomeC);
        janela.add(jFormattedTextPlaca);
        janela.add(jFormattedTextAno);
        janela.add(jFormattedTextLocacao);
        janela.add(jFormattedTextEntregaC);


        btnSalvar = new JButton("Salvar");
        btnSalvar.addActionListener(this);
        btnSalvar.setBounds(150,400,100,20);
        add(btnSalvar);


        setSize(500,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        if (btn == btnSalvar) {

            JOptionPane.showMessageDialog(null,"Aluguel realizado com sucesso!","SUCESSO"
                    ,JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
