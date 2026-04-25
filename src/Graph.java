public class Graph
{
    public Vector[] buildGraph(String sequence)
    {
        String[] seq = sequence.split(" ");
        Vector[] nodes = new Vector[seq.length];
        Vector Start = new Vector(seq[0]);
        for (int i = 0;i < seq.length; i++)
        {
            nodes[i] = new Vector(seq[i]);
        }

        for(int i = 0; i < nodes.length; i++)
        {
            int out1 = (2 * i + 1) % nodes.length;
            int out2 = (2 * i + 2) % nodes.length;

            nodes[i].Out1 = nodes[out1];
            nodes[i].Out2 = nodes[out2];

        }
        return nodes;
    }
}
