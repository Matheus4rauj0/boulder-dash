package fr.enssat.BoulderDash;

import fr.enssat.BoulderDash.controllers.NavigationBetweenViewController;

import javax.swing.*;


/**
 * Game
 *
 * Spawns the game.
 *
 * @author      Valerian Saliou <valerian@valeriansaliou.name>
 * @since       2015-06-19
 */
public class Game {
    /**
     * Class constructor
     *
     * @param  args  Command-line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new NavigationBetweenViewController();
            }
        });
    }
}
/*1. SonarQube (java:S120) - Rename this package name to match the regular expression 
^[a-z]+(\.[a-z][a-z0-9_])$.
Esse "maus cheiro" está relacionado ao nome do pacote no seu projeto Java.
 O SonarQube está sugerindo que você renomeie seu pacote para seguir uma convenção
  de nomenclatura recomendada.

O que ele significa:

O SonarQube espera que os nomes dos pacotes sigam um formato específico.
 De acordo com a regra ^[a-z]+(\.[a-z][a-z0-9_])$, o nome do pacote precisa:
Começar com letras minúsculas (como mypackage).
Se o nome tiver múltiplos níveis, como com.exemplo.app,
 cada nível deve seguir o mesmo padrão: letras minúsculas, com possíveis números e 
 sublinhados (_) após o primeiro caractere.
Exemplo de Pacote Inválido: MyPackage (não segue a regra de letras minúsculas).
 Exemplo de Pacote Válido: mypackage ou com.exemplo.app.

Como Resolver:

Se o nome do pacote no seu código não seguir essa convenção,
 basta renomear o pacote para que ele siga as regras de nomenclatura do Java */

/*2. SonarQube (java:S1604) - Make this anonymous inner class a lambda.

Esse "maus cheiro" se refere ao uso de classes internas anônimas e
 sugere substituí-las por expressões lambda, que são mais concisas e modernas,
  melhorando a legibilidade e a manutenção do código.

O que ele significa:

Em Java, classes internas anônimas são frequentemente usadas quando você 
precisa implementar uma interface ou classe abstrata com apenas um método.
A partir do Java 8, você pode substituir muitas dessas classes internas por expressões lambda.
Uma expressão lambda torna o código mais limpo e menos verboso. */