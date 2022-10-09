# Programação Orientada a Objetos

## Aprimorando conceitos através de programas simples

### Herança:
1. Características comuns a diversas classes reunidas em uma classe BASE, chamada de `superclasse`    
2.  `extends` palavra reservada para quando se deseja utilizar herança, herdando atributos, métodos públicos e protegidos da superclasse
3.  Características: atributos e métodos
4. `super` representa uma chamada de método ou acesso a um atributo da superclasse, por isso tem esse nome
5. É possível sobrescrever um método da classe Base na filha, ou subclasse, a exemplo o caso do valor do método de tirarCopias, que para alunos é mais barato
6. `@Override` indica que o método da classe filha substitui o método da classe base.
7. Ao utilizar a palavra especial `final` no método da classe base, não será possível sobrescrever o método nas classes filhas.
8. 