// Copyright (c) Michael M. Magruder (https://github.com/mikemag)
//
// This source code is licensed under the MIT license found in the
// LICENSE file in the root directory of this source tree.

import java.io.FileReader;
import java.util.Scanner;

// This program tests students' solutions to the Mastermind scoring problem.
//
// Create a new subclass of StudentAlgorithm and place the student's scoring function in
// scoreCodewords(), converting inputs and outputs as necessary. Then add a new instance of the
// subclass to the algos array in main(), and run.
//
// An example is provided, as are a couple of helpers to convert inputs to common forms.

public class MastermindTester {

  private static final String testFilename = "mastermind_4p6c.txt";

  //-------------------------------------------------------------------------------------------
  // This is an example using a fake student and a broken algorithm.
  static class ExampleStudent extends StudentAlgorithm {

    public ExampleStudent() {
      super("ExampleJoe"); // Put your name or GitHub username here
    }

    // Return black hits (correct color and position) in [0] and white hits (correct color but wrong
    // position) in [1].
    public int[] scoreCodewords(String codeword1, String codeword2) {
      // This algorithm likes the codewords to be in byte arrays.
      byte[] secretDigits = codeStringToBytes(codeword1);
      byte[] guessDigits = codeStringToBytes(codeword2);

      // Note: this algorithm is weird and broken on purpose. Don't spend much time, if any,
      // studying it. Replace it with your own!!
      int b = 0;
      int w = 0;
      int used = 0;

      for (int i = 0; i < 4; i++) {
        if (guessDigits[i] == secretDigits[i]) {
          b++;
          used |= 1 << i;
        } else {
          for (int j = 0; j < 4; j++) {
            if ((used & 1 << j) == 0 && guessDigits[i] == secretDigits[j]) {
              w++;
              used |= 1 << j;
              break;
            }
          }
        }
      }

      // Return the hit counts in the order required!
      return new int[] {b, w};
    }
  }

  // Abstract class for students' algorithms. Implement this with the student's code in
  // scoreCodewords().
  static abstract class StudentAlgorithm {

    private final String name;
    private int totalRun;
    private int totalFailed;
    private String firstFailure;

    public StudentAlgorithm(String name) {
      this.name = name;
    }

    // Return black hits (correct color and position) in [0] and white hits (correct color but wrong
    // position) in [1].
    abstract public int[] scoreCodewords(String codeword1, String codeword2);

    // Codeword conversion helper: turn it into an array of bytes
    public static byte[] codeStringToBytes(String s) {
      byte[] r = s.getBytes();
      for (int i = 0; i < r.length; i++) {
        r[i] -= '0';
      }
      return r;
    }

    // Codeword conversion helper: turn it into an array of ints
    public static int[] codeStringToInts(String s) {
      int[] r = new int[s.length()];
      int i = 0;
      for (char c : s.toCharArray()) {
        r[i++] = c - '0';
      }
      return r;
    }

    // Run a single test and record the result
    public void runTest(String word1, String word2, int expectedB, int expectedW) {
      totalRun++;
      try {
        int[] r = scoreCodewords(word1, word2);
        if (r[0] != expectedB || r[1] != expectedW) {
          totalFailed++;
          if (firstFailure == null) {
            firstFailure = String.format("%s vs %s expected %d%d, got %d%d",
                word1, word2, expectedB, expectedW, r[0], r[1]);
          }
        }
      } catch (Exception e) {
        totalFailed++;
        if (firstFailure == null) {
          firstFailure = String.format("%s vs %s expected %d%d, got %s",
              word1, word2, expectedB, expectedW, e);
        }
      }
    }

    @Override
    public String toString() {
      String r = String.format("%30s: passed %6.2f%%",
          name, (float) (totalRun - totalFailed) / totalRun * 100.0);
      if (firstFailure != null) {
        r += ", first failure: " + firstFailure;
      }
      return r;
    }
  }

  private static void runTestsFromFile(StudentAlgorithm[] algos) {
    System.out.format("Testing %d scoring algorithms with file %s...\n", algos.length, testFilename);
    try {
      int total = 0;
      FileReader fr = new FileReader(testFilename);
      Scanner lineScanner = new Scanner(fr);
      lineScanner.nextLine(); // Drop the header row

      while (lineScanner.hasNextLine()) {
        total++;
        String line = lineScanner.nextLine();
        String[] testData = line.split(",");
        for (StudentAlgorithm a : algos) {
          a.runTest(
              testData[0],
              testData[1],
              Integer.parseInt(testData[2]),
              Integer.parseInt(testData[3]));
        }
      }

      System.out.format("Done running %,d test cases.\n\n", total);
    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    StudentAlgorithm[] algos = {
        new ExampleStudent(),
        // Add more student algorithms here
    };

    runTestsFromFile(algos);

    for (StudentAlgorithm a : algos) {
      System.out.println(a);
    }
  }
}
