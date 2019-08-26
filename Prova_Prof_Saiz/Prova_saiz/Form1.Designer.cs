namespace Prova_saiz
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            System.Windows.Forms.Label nomeLabel;
            System.Windows.Forms.Label nomeLabel1;
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.txtid = new System.Windows.Forms.TextBox();
            this.txtnome = new System.Windows.Forms.TextBox();
            this.txtsacao = new System.Windows.Forms.TextBox();
            this.txtSalario = new System.Windows.Forms.TextBox();
            this.btncadastrar = new System.Windows.Forms.Button();
            this.btnlistar = new System.Windows.Forms.Button();
            this.txtlistar = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.funciBindingNavigator = new System.Windows.Forms.BindingNavigator(this.components);
            this.bindingNavigatorMoveFirstItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorMovePreviousItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorSeparator = new System.Windows.Forms.ToolStripSeparator();
            this.bindingNavigatorPositionItem = new System.Windows.Forms.ToolStripTextBox();
            this.bindingNavigatorCountItem = new System.Windows.Forms.ToolStripLabel();
            this.bindingNavigatorSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.bindingNavigatorMoveNextItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorMoveLastItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorSeparator2 = new System.Windows.Forms.ToolStripSeparator();
            this.bindingNavigatorAddNewItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorDeleteItem = new System.Windows.Forms.ToolStripButton();
            this.funciBindingNavigatorSaveItem = new System.Windows.Forms.ToolStripButton();
            this.funciBindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.funcionarioDataSet = new Prova_saiz.funcionarioDataSet();
            this.funciTableAdapter = new Prova_saiz.funcionarioDataSetTableAdapters.funciTableAdapter();
            this.tableAdapterManager = new Prova_saiz.funcionarioDataSetTableAdapters.TableAdapterManager();
            this.listar = new System.Windows.Forms.Button();
            this.textBox1 = new System.Windows.Forms.TextBox();
            this.funcionarioDataSet1 = new Prova_saiz.funcionarioDataSet1();
            this.funciBindingSource1 = new System.Windows.Forms.BindingSource(this.components);
            this.funciTableAdapter1 = new Prova_saiz.funcionarioDataSet1TableAdapters.funciTableAdapter();
            this.nomeListBox = new System.Windows.Forms.ListBox();
            nomeLabel = new System.Windows.Forms.Label();
            nomeLabel1 = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.funciBindingNavigator)).BeginInit();
            this.funciBindingNavigator.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.funciBindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.funcionarioDataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.funcionarioDataSet1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.funciBindingSource1)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(23, 37);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(16, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Id";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(23, 96);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(38, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Secao";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(23, 65);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(35, 13);
            this.label3.TabIndex = 2;
            this.label3.Text = "Nome";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(23, 126);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(39, 13);
            this.label4.TabIndex = 3;
            this.label4.Text = "Salario";
            // 
            // txtid
            // 
            this.txtid.Location = new System.Drawing.Point(107, 34);
            this.txtid.Name = "txtid";
            this.txtid.Size = new System.Drawing.Size(100, 20);
            this.txtid.TabIndex = 4;
            // 
            // txtnome
            // 
            this.txtnome.Location = new System.Drawing.Point(107, 65);
            this.txtnome.Name = "txtnome";
            this.txtnome.Size = new System.Drawing.Size(100, 20);
            this.txtnome.TabIndex = 5;
            // 
            // txtsacao
            // 
            this.txtsacao.Location = new System.Drawing.Point(107, 93);
            this.txtsacao.Name = "txtsacao";
            this.txtsacao.Size = new System.Drawing.Size(100, 20);
            this.txtsacao.TabIndex = 6;
            // 
            // txtSalario
            // 
            this.txtSalario.Location = new System.Drawing.Point(107, 123);
            this.txtSalario.Name = "txtSalario";
            this.txtSalario.Size = new System.Drawing.Size(100, 20);
            this.txtSalario.TabIndex = 7;
            // 
            // btncadastrar
            // 
            this.btncadastrar.Location = new System.Drawing.Point(28, 177);
            this.btncadastrar.Name = "btncadastrar";
            this.btncadastrar.Size = new System.Drawing.Size(75, 23);
            this.btncadastrar.TabIndex = 8;
            this.btncadastrar.Text = "Cadastrar";
            this.btncadastrar.UseVisualStyleBackColor = true;
            this.btncadastrar.Click += new System.EventHandler(this.btncadastrar_Click);
            // 
            // btnlistar
            // 
            this.btnlistar.Location = new System.Drawing.Point(132, 1);
            this.btnlistar.Name = "btnlistar";
            this.btnlistar.Size = new System.Drawing.Size(75, 23);
            this.btnlistar.TabIndex = 9;
            this.btnlistar.Text = "Listar";
            this.btnlistar.UseVisualStyleBackColor = true;
            // 
            // txtlistar
            // 
            this.txtlistar.Location = new System.Drawing.Point(69, 4);
            this.txtlistar.Name = "txtlistar";
            this.txtlistar.Size = new System.Drawing.Size(49, 20);
            this.txtlistar.TabIndex = 11;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(25, 8);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(38, 13);
            this.label5.TabIndex = 12;
            this.label5.Text = "Seção";
            // 
            // funciBindingNavigator
            // 
            this.funciBindingNavigator.AddNewItem = this.bindingNavigatorAddNewItem;
            this.funciBindingNavigator.BindingSource = this.funciBindingSource;
            this.funciBindingNavigator.CountItem = this.bindingNavigatorCountItem;
            this.funciBindingNavigator.DeleteItem = this.bindingNavigatorDeleteItem;
            this.funciBindingNavigator.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.bindingNavigatorMoveFirstItem,
            this.bindingNavigatorMovePreviousItem,
            this.bindingNavigatorSeparator,
            this.bindingNavigatorPositionItem,
            this.bindingNavigatorCountItem,
            this.bindingNavigatorSeparator1,
            this.bindingNavigatorMoveNextItem,
            this.bindingNavigatorMoveLastItem,
            this.bindingNavigatorSeparator2,
            this.bindingNavigatorAddNewItem,
            this.bindingNavigatorDeleteItem,
            this.funciBindingNavigatorSaveItem});
            this.funciBindingNavigator.Location = new System.Drawing.Point(0, 0);
            this.funciBindingNavigator.MoveFirstItem = this.bindingNavigatorMoveFirstItem;
            this.funciBindingNavigator.MoveLastItem = this.bindingNavigatorMoveLastItem;
            this.funciBindingNavigator.MoveNextItem = this.bindingNavigatorMoveNextItem;
            this.funciBindingNavigator.MovePreviousItem = this.bindingNavigatorMovePreviousItem;
            this.funciBindingNavigator.Name = "funciBindingNavigator";
            this.funciBindingNavigator.PositionItem = this.bindingNavigatorPositionItem;
            this.funciBindingNavigator.Size = new System.Drawing.Size(405, 25);
            this.funciBindingNavigator.TabIndex = 13;
            this.funciBindingNavigator.Text = "bindingNavigator1";
            // 
            // bindingNavigatorMoveFirstItem
            // 
            this.bindingNavigatorMoveFirstItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveFirstItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveFirstItem.Image")));
            this.bindingNavigatorMoveFirstItem.Name = "bindingNavigatorMoveFirstItem";
            this.bindingNavigatorMoveFirstItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveFirstItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMoveFirstItem.Text = "Move first";
            // 
            // bindingNavigatorMovePreviousItem
            // 
            this.bindingNavigatorMovePreviousItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMovePreviousItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMovePreviousItem.Image")));
            this.bindingNavigatorMovePreviousItem.Name = "bindingNavigatorMovePreviousItem";
            this.bindingNavigatorMovePreviousItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMovePreviousItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMovePreviousItem.Text = "Move previous";
            // 
            // bindingNavigatorSeparator
            // 
            this.bindingNavigatorSeparator.Name = "bindingNavigatorSeparator";
            this.bindingNavigatorSeparator.Size = new System.Drawing.Size(6, 25);
            // 
            // bindingNavigatorPositionItem
            // 
            this.bindingNavigatorPositionItem.AccessibleName = "Position";
            this.bindingNavigatorPositionItem.AutoSize = false;
            this.bindingNavigatorPositionItem.Name = "bindingNavigatorPositionItem";
            this.bindingNavigatorPositionItem.Size = new System.Drawing.Size(50, 23);
            this.bindingNavigatorPositionItem.Text = "0";
            this.bindingNavigatorPositionItem.ToolTipText = "Current position";
            // 
            // bindingNavigatorCountItem
            // 
            this.bindingNavigatorCountItem.Name = "bindingNavigatorCountItem";
            this.bindingNavigatorCountItem.Size = new System.Drawing.Size(35, 22);
            this.bindingNavigatorCountItem.Text = "of {0}";
            this.bindingNavigatorCountItem.ToolTipText = "Total number of items";
            // 
            // bindingNavigatorSeparator1
            // 
            this.bindingNavigatorSeparator1.Name = "bindingNavigatorSeparator";
            this.bindingNavigatorSeparator1.Size = new System.Drawing.Size(6, 25);
            // 
            // bindingNavigatorMoveNextItem
            // 
            this.bindingNavigatorMoveNextItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveNextItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveNextItem.Image")));
            this.bindingNavigatorMoveNextItem.Name = "bindingNavigatorMoveNextItem";
            this.bindingNavigatorMoveNextItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveNextItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMoveNextItem.Text = "Move next";
            // 
            // bindingNavigatorMoveLastItem
            // 
            this.bindingNavigatorMoveLastItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveLastItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveLastItem.Image")));
            this.bindingNavigatorMoveLastItem.Name = "bindingNavigatorMoveLastItem";
            this.bindingNavigatorMoveLastItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveLastItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMoveLastItem.Text = "Move last";
            // 
            // bindingNavigatorSeparator2
            // 
            this.bindingNavigatorSeparator2.Name = "bindingNavigatorSeparator";
            this.bindingNavigatorSeparator2.Size = new System.Drawing.Size(6, 25);
            // 
            // bindingNavigatorAddNewItem
            // 
            this.bindingNavigatorAddNewItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorAddNewItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorAddNewItem.Image")));
            this.bindingNavigatorAddNewItem.Name = "bindingNavigatorAddNewItem";
            this.bindingNavigatorAddNewItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorAddNewItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorAddNewItem.Text = "Add new";
            // 
            // bindingNavigatorDeleteItem
            // 
            this.bindingNavigatorDeleteItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorDeleteItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorDeleteItem.Image")));
            this.bindingNavigatorDeleteItem.Name = "bindingNavigatorDeleteItem";
            this.bindingNavigatorDeleteItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorDeleteItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorDeleteItem.Text = "Delete";
            // 
            // funciBindingNavigatorSaveItem
            // 
            this.funciBindingNavigatorSaveItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.funciBindingNavigatorSaveItem.Image = ((System.Drawing.Image)(resources.GetObject("funciBindingNavigatorSaveItem.Image")));
            this.funciBindingNavigatorSaveItem.Name = "funciBindingNavigatorSaveItem";
            this.funciBindingNavigatorSaveItem.Size = new System.Drawing.Size(23, 22);
            this.funciBindingNavigatorSaveItem.Text = "Save Data";
            this.funciBindingNavigatorSaveItem.Click += new System.EventHandler(this.funciBindingNavigatorSaveItem_Click);
            // 
            // nomeLabel
            // 
            nomeLabel.AutoSize = true;
            nomeLabel.Location = new System.Drawing.Point(7, 271);
            nomeLabel.Name = "nomeLabel";
            nomeLabel.Size = new System.Drawing.Size(38, 13);
            nomeLabel.TabIndex = 13;
            nomeLabel.Text = "Nome:";
            // 
            // funciBindingSource
            // 
            this.funciBindingSource.DataMember = "funci";
            this.funciBindingSource.DataSource = this.funcionarioDataSet;
            // 
            // funcionarioDataSet
            // 
            this.funcionarioDataSet.DataSetName = "funcionarioDataSet";
            this.funcionarioDataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // funciTableAdapter
            // 
            this.funciTableAdapter.ClearBeforeFill = true;
            // 
            // tableAdapterManager
            // 
            this.tableAdapterManager.BackupDataSetBeforeUpdate = false;
            this.tableAdapterManager.funciTableAdapter = this.funciTableAdapter;
            this.tableAdapterManager.UpdateOrder = Prova_saiz.funcionarioDataSetTableAdapters.TableAdapterManager.UpdateOrderOption.InsertUpdateDelete;
            // 
            // listar
            // 
            this.listar.Location = new System.Drawing.Point(145, 219);
            this.listar.Name = "listar";
            this.listar.Size = new System.Drawing.Size(75, 23);
            this.listar.TabIndex = 15;
            this.listar.Text = "listar";
            this.listar.UseVisualStyleBackColor = true;
            this.listar.Click += new System.EventHandler(this.listar_Click);
            // 
            // textBox1
            // 
            this.textBox1.Location = new System.Drawing.Point(28, 222);
            this.textBox1.Name = "textBox1";
            this.textBox1.Size = new System.Drawing.Size(100, 20);
            this.textBox1.TabIndex = 16;
            // 
            // funcionarioDataSet1
            // 
            this.funcionarioDataSet1.DataSetName = "funcionarioDataSet1";
            this.funcionarioDataSet1.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // funciBindingSource1
            // 
            this.funciBindingSource1.DataMember = "funci";
            this.funciBindingSource1.DataSource = this.funcionarioDataSet1;
            // 
            // funciTableAdapter1
            // 
            this.funciTableAdapter1.ClearBeforeFill = true;
            // 
            // nomeLabel1
            // 
            nomeLabel1.AutoSize = true;
            nomeLabel1.Location = new System.Drawing.Point(25, 306);
            nomeLabel1.Name = "nomeLabel1";
            nomeLabel1.Size = new System.Drawing.Size(38, 13);
            nomeLabel1.TabIndex = 16;
            nomeLabel1.Text = "Nome:";
            // 
            // nomeListBox
            // 
            this.nomeListBox.DataBindings.Add(new System.Windows.Forms.Binding("SelectedValue", this.funciBindingSource, "Nome", true));
            this.nomeListBox.DataSource = this.funciBindingSource;
            this.nomeListBox.DisplayMember = "Nome";
            this.nomeListBox.FormattingEnabled = true;
            this.nomeListBox.Location = new System.Drawing.Point(69, 306);
            this.nomeListBox.Name = "nomeListBox";
            this.nomeListBox.Size = new System.Drawing.Size(179, 147);
            this.nomeListBox.TabIndex = 17;
            this.nomeListBox.ValueMember = "Nome";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(405, 503);
            this.Controls.Add(nomeLabel1);
            this.Controls.Add(this.nomeListBox);
            this.Controls.Add(this.textBox1);
            this.Controls.Add(this.listar);
            this.Controls.Add(nomeLabel);
            this.Controls.Add(this.funciBindingNavigator);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.txtlistar);
            this.Controls.Add(this.btnlistar);
            this.Controls.Add(this.btncadastrar);
            this.Controls.Add(this.txtSalario);
            this.Controls.Add(this.txtsacao);
            this.Controls.Add(this.txtnome);
            this.Controls.Add(this.txtid);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.funciBindingNavigator)).EndInit();
            this.funciBindingNavigator.ResumeLayout(false);
            this.funciBindingNavigator.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.funciBindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.funcionarioDataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.funcionarioDataSet1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.funciBindingSource1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtid;
        private System.Windows.Forms.TextBox txtnome;
        private System.Windows.Forms.TextBox txtsacao;
        private System.Windows.Forms.TextBox txtSalario;
        private System.Windows.Forms.Button btncadastrar;
        private System.Windows.Forms.Button btnlistar;
        private System.Windows.Forms.TextBox txtlistar;
        private System.Windows.Forms.Label label5;
        private funcionarioDataSet funcionarioDataSet;
        private System.Windows.Forms.BindingSource funciBindingSource;
        private funcionarioDataSetTableAdapters.funciTableAdapter funciTableAdapter;
        private funcionarioDataSetTableAdapters.TableAdapterManager tableAdapterManager;
        private System.Windows.Forms.BindingNavigator funciBindingNavigator;
        private System.Windows.Forms.ToolStripButton bindingNavigatorAddNewItem;
        private System.Windows.Forms.ToolStripLabel bindingNavigatorCountItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorDeleteItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMoveFirstItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMovePreviousItem;
        private System.Windows.Forms.ToolStripSeparator bindingNavigatorSeparator;
        private System.Windows.Forms.ToolStripTextBox bindingNavigatorPositionItem;
        private System.Windows.Forms.ToolStripSeparator bindingNavigatorSeparator1;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMoveNextItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMoveLastItem;
        private System.Windows.Forms.ToolStripSeparator bindingNavigatorSeparator2;
        private System.Windows.Forms.ToolStripButton funciBindingNavigatorSaveItem;
        private System.Windows.Forms.Button listar;
        private System.Windows.Forms.TextBox textBox1;
        private funcionarioDataSet1 funcionarioDataSet1;
        private System.Windows.Forms.BindingSource funciBindingSource1;
        private funcionarioDataSet1TableAdapters.funciTableAdapter funciTableAdapter1;
        private System.Windows.Forms.ListBox nomeListBox;
    }
}

