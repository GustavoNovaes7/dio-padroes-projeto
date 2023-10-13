package dio.padroes.projeto.java;

import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.Robo;
import strategy.ComportamentoNormal;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoAgressivo;

public class DioPadroesProjetoJava {

    public static void main(String[] args) {

        //Utilizando Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);
        
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);

        //Utilizando Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento aressivo = new ComportamentoAgressivo();
        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(aressivo);
        robo.mover();

        //Utilizando Facade
        Facade facade = new Facade();
        facade.migrarCliente("Nome Teste", "3333-00");
    }

}
