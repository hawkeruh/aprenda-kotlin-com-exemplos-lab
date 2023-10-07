enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nome: String, val id: Int, var email: String)

class Professor (val nome: String, val id: Int, var horas: Int = 0) {
    override fun toString(): String {
        return "Prof. $nome"
    }
}

data class ConteudoEducacional(val nome: String, val duracao: Int, val profs: List<Professor>)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    fun desmatricular(usuario: Usuario) {
        inscritos.remove(usuario)
    }
}

fun main() {

    //lista de professores inicial e uma formação com conteudo de dois módulos(conteudoeducacional)
    val professorLista = mutableListOf(Professor("Gustavo", 177, 32), Professor("Cássia", 512, 29), Professor("Marlon", 205, 12))
    val conteudoLista =  mutableListOf(ConteudoEducacional("Python", 15, professorLista), ConteudoEducacional("Algoritmos", 20, professorLista))
    val ed1 = Formacao("Estrutura de Dados", Nivel.BASICO, conteudoLista)
    println(ed1)

    //CENÁRIO 1
    professorLista.remove(Professor("Gustavo", 177, 32))
    val dracula = Professor("Vlad Tepes", 66)
    professorLista.add(dracula)
    
    val conteudo2 = mutableListOf(ConteudoEducacional("Teoria dos Grafos", 30, professorLista))
    val neural = Formacao("Redes Neurais", Nivel.INTERMEDIARIO, conteudo2)

    println(neural)
    
    //CENÁRIO 2
    val profDracula = mutableListOf(dracula)
    val conteudo_especializado = mutableListOf(ConteudoEducacional("Circuitos Quânticos", 19, profDracula), ConteudoEducacional("Mecânica Quântica", 30, profDracula), ConteudoEducacional("Teoria da Complexidade Quântica", 13, profDracula))
    val curso_avancado = Formacao("Computação Quântica", Nivel.AVANCADO, conteudo_especializado)


    println(curso_avancado)

    //CENÁRIO 3 
    curso_avancado.matricular(Usuario("Hercules Martins Silva",10032,"hercu_poirot@myemail.com"))
    curso_avancado.matricular(Usuario("Diego Tranquinas",10044,"trakinasbiscuit@myemail.com"))
    curso_avancado.matricular(Usuario("Simone Cardoso",100682,"fhc_filha@myemail.com"))

    val professorAREA2 = mutableListOf(Professor("Vanice", 300), Professor("Tulio", 301), Professor("Geraldo", 302), dracula)
    val conteudo_mathplus = mutableListOf(ConteudoEducacional("Física", 30, professorAREA2), ConteudoEducacional("Cálculo", 60, professorAREA2), ConteudoEducacional("Algebra Linear", 15, professorAREA2),)
    val curso_fundamentos = Formacao("Fundamentos", Nivel.BASICO, conteudo_mathplus)

    println(curso_fundamentos)

}
