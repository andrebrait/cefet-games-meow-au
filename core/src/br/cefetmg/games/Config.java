package br.cefetmg.games;

/**
 *
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class Config {


    public static final int WORLD_WIDTH = 1280;
    public static final int WORLD_HEIGHT = 720;
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final int WEST = 2;
    public static final int EAST = 3;
    public static final int SOUTHEAST = 4;
    public static final int NORTHEAST = 5;
    public static final int SOUTHWEST = 6;
    public static final int NORTHWEST = 7;
    
    public static final int VERTICAL = 0;
    public static final int HORIZONTAL = 1;
    
    /**
     * A razão de aspecto do mundo de jogo, igual a 16:9.
     *
     * Mesmo que a janela/tela em que o jogo está sendo renderizado não tenha
     * este valor de razão de aspecto, o jogo será sempre renderizado com ela.
     *
     * Caso a razão de aspecto seja menor (e.g., 4:3), barras superiores e
     * inferiores "em branco" aparecerão e o jogo será renderizado apenas no
     * centro do espaço total.
     *
     * Caso a razão de aspecto seja maior (e.g., 16:10), as barras "em branco"
     * são laterais.
     */
    public static final float DESIRED_ASPECT_RATIO
            = (float) WORLD_WIDTH / (float) WORLD_HEIGHT;

    /**
     * A porcentagem máxima que uma tela de um dispositivo pode ter sua
     * razão de aspecto maior ou menor que a razão de aspecto ideal 
     * (DESIRED_ASPECT_RATIO) para que será usada uma Viewport que preenche o
     * espaço todo da tela (e pode deixar algumas coisas pra fora) ou se 
     * faz com que tudo caiba nela (e surgem barras pretas).
     */
    public static float MAXIMUM_ASPECTO_RATIO_DIFFERENCE = 0.1f;

    /**
     * Tempo em que a tela de splash fica sendo mostrada.
     */
    public static final long TIME_ON_SPLASH_SCREEN = 3750;

    /**
     * Número de vidas do jogador.
     */
    public static final int MAX_LIVES = 3;
    
    /**
     * Tempo mostrando o countdown de cada MiniGame.
     */
    public static final float TIME_SHOWING_MINIGAME_INSTRUCTIONS = 4f;

    /**
     * A quantos milissegundos faltando para o término do minigame deve aparecer
     * o contador regressivo na HUD.
     */
    public static final float MINIGAME_COUNTDOWN_ON_HUD_BEGIN_AT = 3f;

}
