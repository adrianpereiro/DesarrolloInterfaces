   M S B A M L   `   `   `  ����B  >Mahjong, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null!clr-namespace:MahjongMahjong  5   	       Mahjong.HallOfFame   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   'localclr-namespace:Mahjong     5   	     � Title$  
HallOfFame��5   	   $	��591��6   $	��543��6)    � 
ResizeMode$ NoResize=�65   .��5	      �  � ColumnDefinitions 5
   
    � RowDefinitions 5   
   �� 5      $	��90* �6   6+   �� 5      $	��10* �6   6+   .+�5   
   &   System.Windows.Controls.DataGrid  -   5          Name$ dgJugadores��5       $��0��6      AutoGenerateColumns .  ��65   �� *ListaJugadores+   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ Posicion��6%   1  +System.Windows.Controls.DataGridBoundColumn   Binding 67   �� *Nombre+6T     5      $ Nombre��6%    65   �� *Nombre+6R     5      $ 
Puntuacion��6%   	   
IsReadOnly	 .  69   �� *Tiempo+6h   5      �� 5   
   -   5        $��Resetear Puntuaciones��5      $
��Left=�61   $��
220,19,0,0q�6L   $��1��6`   $	��Top=�6m   $	��140��6�   6�   �� 5   
   $��Cerrar��6   $
��Left=�6"   $��
410,19,0,0q�6=   $��1��6Q   $	��Top=�6^   $��75��6v   
 �� IsCancel
 . 6�   5      5      