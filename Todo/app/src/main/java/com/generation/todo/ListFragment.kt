package com.generation.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.generation.todo.adapter.TarefaAdapter
import com.generation.todo.model.Tarefa

class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        /*
        RecyclerView

        1 - Layout dos itens

        2 - Listagem de itens - Criação da Classe de Modelo e da listagem de itens

        3 - Configurar o Adapter - Configuração do Adapter (ou seja, o recurso que cuidará do processamento de
        dados da lista) juntamente com a ViewHolder (ou seja, o recurso que vai dizer qual layout
        que vamos utilizar)

        4 - Instanciar e configurar a RecyclerView dentro do Fragment

         */

        val view = inflater.inflate(R.layout.fragment_list, container, false)

        //Gerando a listagem de tarefas com base na classe de modelo
        val listTarefas = mutableListOf(
            Tarefa(
                "Limpar a Casa",
                "Iniciar na parte da manhã",
                "Henrique",
                "2022-21-03",
                true,
                "Dia a Dia"
            ),
            Tarefa(
                "Lavar a Louça",
                "Do dia todo :^)",
                "Henrique",
                "2022-22-03",
                false,
                "Dia a Dia"
            ),
            Tarefa(
                "Ir ao Parque",
                "Me encontrar com o pessoal no metrô",
                "Henrique",
                "2022-26-03",
                false,
                "Lazer"
            )
        )

        //Configurar o Adapter

        //Instanciar o RecyclerView da maneira correta
        val recyclerTarefa = view.findViewById<RecyclerView>(R.id.recyclerTarefa)

        //Instaciar o adapter
        val adapter = TarefaAdapter()

        //Definir o Layout Manager da RecyclerView
        recyclerTarefa.layoutManager = LinearLayoutManager(context)

        //Passar o adapter criado para o recyclerTarefa
        recyclerTarefa.adapter = adapter

        //Definir a lista para ter um tamanho fixo indepedente dos itens
        recyclerTarefa.setHasFixedSize(true)

        //Definindo quais vão ser os dados da lista
        adapter.setLista(listTarefas)

        return view
    }

}