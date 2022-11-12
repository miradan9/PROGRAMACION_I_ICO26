package Busqueda;
import java.util.Scanner;

public class Pruebad {


public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            String[] listaOrdenada = {"accommodate", "active", "administer", "advertising", "age", "airline", "alone", "american", "animate", "apartment", "apprentice", "argument", "arthritis", "assessment", "athlete", "audit", "award", "bald", "baseball",
                    "beast", "believe", "betray", "biology", "blend", "bone", "boyfriend", "brew",
                    "buck", "busy", "camouflage", "captive", "cash", "celebration", "chairman",
                    "chart", "chief", "chunk", "class", "closely", "coffin", "columnist", "common", "competent", "compress", "condensed", "connect", "constantly", "contemporary", "convenient", "copper", "couch", "cover", "creek", "cruel", "current", "dare",
                    "debt", "deer", "delete", "depend", "designate", "devastate", "die", "dine", "disapprove", "dishonest", "distract", "doctor", "dozen", "driveway", "dye", "economic", "egg", "elevate", "emphasis", "engage", "enthusiastic", "equipment", "estimate", "everybody", "excellent", "existing", "explore", "extremely", "fair", "farmer", "feeble", "fiery", "finger", "flaw", "flush", "forefinger", "foster",
                    "freight", "fuel", "gain", "gender", "get", "gloom", "gradual", "graze",
                    "growing", "habitual", "hardy", "heal", "help", "highway", "home", "hospitable", "humanitarian", "i", "image", "implication", "incline", "indirect", "informative", "innocent", "institution", "interaction", "into", "involve", "its", "joke", "kettle",
                    "knit", "lap", "layer", "legacy", "library", "limitation", "loaf", "loss", "lyric",
                    "maker", "manuscript", "mash", "meaning", "memorable", "meter", "mine", "missile",
                    "molecule", "mortal", "much", "mystery", "navy", "nerve", "nobody", "nourish",
                    "obey", "occupy", "old", "opponent", "organize", "outlaw", "overnight", "painting",
                    "paralysis", "passage", "payment", "pepper", "person", "phase", "pierce", "planning", "plumbing", "politician", "position", "powerful", "pregnancy", "pretend", "prior", "profession", "properly", "provide", "pudding", "qualify", "radiate", "rare", "realize", "reconcile", "reform", "regulation", "reluctance", "repeat", "rescue", "respirator", "retrieve", "ridiculous", "rock", "rubbish", "salad", "saucer", "scholarship", "search", "seizure", "sergeant", "shadow", "shield", "shoulder", "significance", "single", "sky", "small", "soccer",
                    "somebody", "soup", "spear", "spirit", "stable", "statement", "stick",
                    "straight", "strict", "stupid", "suck", "supervise", "surrender", "swift",
                    "tail", "teach", "temperate", "terrestrial", "their", "thing", "throw", "today",
                    "torture", "traditional", "trash", "triumph", "turn", "uncle", "unity", "upright",
                    "vacation", "vegetarian", "victory", "visit", "wage", "watch", "week", "where", "wild", "without", "worse", "yellow"};
            BusquedaSecuencial busquedaSecuencialx = new BusquedaSecuencial(listaOrdenada);
            int opcion;
            int indice;
            String valorABuscar;
            do{
                System.out.println("Valeria Danae Aguayo Miranda");
                System.out.println("---------------------------------------");
                System.out.println("Busqueda secuencial o lineal");
                System.out.println("1. Buscar palabra");
                System.out.println("2. Salir");
                opcion = entrada.nextInt();
                switch(opcion){
                    case 1:
                        System.out.println("Dame la palabra a buscar: ");
                        valorABuscar = entrada.nextLine();
                        System.out.println();
                        indice = busquedaSecuencialx.buscar(valorABuscar);
                        if (indice == -1){
                            System.out.println("No se encontro");
                        }else{
                            System.out.println("Se encontro en la posicion"+indice);
                        }
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Opcion No valida");
                        break;
                }
            }while (opcion != 2);
        }

    }
