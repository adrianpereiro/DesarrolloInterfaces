using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mahjong
{
   public class Jugador
    {
        public int Posicion { get; set; }
        public String Nombre { get; set; }

        public int Tiempo { get; set; }
        
        public Jugador(int posicion, string nombre, int tiempo){
            this.Posicion = posicion;
            this.Nombre = nombre;
            this.Tiempo = tiempo;
        }
    }
}
