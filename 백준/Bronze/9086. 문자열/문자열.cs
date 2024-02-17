int T = int.Parse(Console.ReadLine());

for (int i = 0; i < T; i++)
{
    string input = Console.ReadLine();
    char firstChar = input[0];
    char lastChar = input[input.Length - 1];

    Console.WriteLine($"{firstChar}{lastChar}");
}