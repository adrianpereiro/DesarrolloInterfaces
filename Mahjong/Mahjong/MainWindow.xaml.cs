using Microsoft.Win32;
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
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Mahjong
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void mnConfiguracion_Click(object sender, RoutedEventArgs e)
        {
            Configuracion configuracion = new Configuracion();
            configuracion.ShowDialog();
            //System.Threading.Thread.Sleep(500);
        }

        private void mnExportar_Click(object sender, RoutedEventArgs e)
        {
            FileDialog fd = new OpenFileDialog();
            fd.ShowDialog();
        }

        private void mnSalir_Click(object sender, RoutedEventArgs e)
        {
            if (MessageBox.Show("Estas seguro de que quieres salir?", "Salir", MessageBoxButton.YesNo, MessageBoxImage.Warning) == MessageBoxResult.Yes)
            {
                this.Close();
            }
        }
    }
}
