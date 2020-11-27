using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace Mahjong
{
    /// <summary>
    /// Lógica de interacción para HallOfFame.xaml
    /// </summary>
    public partial class HallOfFame : Window
    {
        public List<Jugador> ListaJugadores { get; set; }
        public HallOfFame()
        {
            ListaJugadores = new List<Jugador>();
            ListaJugadores.Add(new Jugador(1,"Prueba",122));
            ListaJugadores.Add(new Jugador(2,"Prueba1",132));
            this.DataContext = this;
            InitializeComponent();
        }
    }
}
