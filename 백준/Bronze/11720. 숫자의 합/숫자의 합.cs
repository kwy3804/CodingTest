int N = int.Parse(Console.ReadLine());
string numbers = Console.ReadLine();

int sum = 0;

for (int i = 0; i < N; i++)
{
    sum += int.Parse(numbers[i].ToString());
}

Console.WriteLine(sum);