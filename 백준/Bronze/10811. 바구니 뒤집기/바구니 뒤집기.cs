class Program
{
    static void Main()
    {
        string[] input = Console.ReadLine().Split();
        int N = int.Parse(input[0]);
        int M = int.Parse(input[1]);

        int[] buckets = new int[N];
        for (int i = 0; i < N; i++)
        {
            buckets[i] = i + 1;
        }

        for (int i = 0; i < M; i++)
        {
            string[] swap = Console.ReadLine().Split();
            int start = int.Parse(swap[0]) - 1;
            int end = int.Parse(swap[1]) - 1;

            ReverseBuckets(buckets, start, end);
        }

        Console.WriteLine(string.Join(" ", buckets));
    }

    static void ReverseBuckets(int[] buckets, int start, int end)
    {
        while (start < end)
        {
            int temp = buckets[start];
            buckets[start] = buckets[end];
            buckets[end] = temp;
            start++;
            end--;
        }
    }
}
