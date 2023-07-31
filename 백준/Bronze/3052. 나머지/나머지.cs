List<int> InputList = new List<int>();

for (int i = 0; i < 10; i++)
{
    int n = int.Parse(Console.ReadLine());
    InputList.Add(n%42);
}
InputList = InputList.Distinct().ToList();

Console.WriteLine(InputList.Count);