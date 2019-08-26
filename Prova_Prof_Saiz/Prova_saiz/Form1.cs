using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Prova_saiz
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btncadastrar_Click(object sender, EventArgs e)
        {
            funcionarioDataSetTableAdapters.funciTableAdapter c = new funcionarioDataSetTableAdapters.funciTableAdapter();
            c.Inserir(txtnome.Text, txtsacao.Text, Decimal.Parse(txtSalario.Text));
            MessageBox.Show("cadastrado com sucesso");
        }

        private void funciBindingNavigatorSaveItem_Click(object sender, EventArgs e)
        {
            this.Validate();
            this.funciBindingSource.EndEdit();
            this.tableAdapterManager.UpdateAll(this.funcionarioDataSet);

        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'funcionarioDataSet1.funci' table. You can move, or remove it, as needed.
            this.funciTableAdapter1.Fill(this.funcionarioDataSet1.funci);
            // TODO: This line of code loads data into the 'funcionarioDataSet.funci' table. You can move, or remove it, as needed.
 

        }

        private void listar_Click(object sender, EventArgs e)
        {
            this.funciTableAdapter.Fill(this.funcionarioDataSet.funci,textBox1.Text);
            
        }
    }
}
