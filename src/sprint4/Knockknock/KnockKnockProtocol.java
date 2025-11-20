package sprint4.Knockknock;

/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

public class KnockKnockProtocol {
    private static final int WAITING = 0;
    private static final int SENTRIDDLE = 1;
    private static final int ANOTHER = 2;

    private static final int NUMRIDDLES = 3;

    private int state = WAITING;
    private int currentRiddle = 0;

    private String[] riddles = { "Vad går och går men kommer aldrig fram till dörren?",
            "Vad har fyra ben under dagen, men sex ben under natten?",
            "Vad växer ju mer du tar bort?" };
    private String[] answers = { "Klockan", "Sängen", "Gropen" };

    private String correct = "Rätt svar!";
    private String inCorrect = "Fel svar!";

    public String processInput(String theInput) {
        String theOutput = null;
        boolean correctAnswer = theInput.equalsIgnoreCase(answers[currentRiddle]);

        if (state == WAITING) {
            theOutput = riddles[currentRiddle];
            state = SENTRIDDLE;
        } else if (state == SENTRIDDLE) {
            if (correctAnswer) {
                theOutput = correct + " Vill du ha en ny gåta? (y/n)";
            } else {
                theOutput = inCorrect + " Korrekt svar är: " + answers[currentRiddle] +
                        " Vill du ha en ny gåta? (y/n)";
            }
            state = ANOTHER;
        } else if (state == ANOTHER) {
            if (theInput.equalsIgnoreCase("y")) {
                if (currentRiddle == (NUMRIDDLES - 1))
                    currentRiddle = 0;
                else
                    currentRiddle++;
                theOutput = riddles[currentRiddle];
                state = SENTRIDDLE;
            } else {
                theOutput = "Bye.";
                state = WAITING;
            }
        }
        return theOutput;
    }
}
