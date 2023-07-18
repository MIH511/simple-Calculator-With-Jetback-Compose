package com.weather.calculatorjetback

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.weather.calculatorjetback.ui.theme.LightGray
import com.weather.calculatorjetback.ui.theme.Orange

@Composable
fun Calculator(
    state:CalculatorState,
    buttonSpacing:Dp,
    modifier:Modifier=Modifier,
    onAction: (CalculatorAction) ->Unit
){

    Box(modifier = modifier){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ) {

            Text(
                text = state.number1+(state.operation?.symbol?:"")+state.number2,
                textAlign = TextAlign.End,
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontSize = 80.sp,
                fontWeight = FontWeight.Light,
                color = Color.White,
                maxLines = 2

            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                modifier = Modifier.fillMaxWidth()
            ) {

                CalculatorButton(
                    symbols ="AC",
                    modifier =Modifier
                        .aspectRatio(2f)
                        .background(LightGray)
                        .weight(2f),
                    onClick = {onAction(CalculatorAction.Clear)}
                )

                CalculatorButton(
                    symbols ="Del",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(LightGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Delete)}
                )

                CalculatorButton(
                    symbols ="/",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Orange)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Operation(CalculatorOperation.Divide))}
                )



            }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Row(
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                modifier = Modifier.fillMaxWidth()
            ) {

                CalculatorButton(
                    symbols ="7",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(7))}
                )

                CalculatorButton(
                    symbols ="8",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(8))}
                )

                CalculatorButton(
                    symbols ="9",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(9))}
                )

                CalculatorButton(
                    symbols ="*",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Orange)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Operation(CalculatorOperation.Multiply))}
                )

            }

            /////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Row(
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                modifier = Modifier.fillMaxWidth()
            ) {

                CalculatorButton(
                    symbols ="4",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(4))}
                )

                CalculatorButton(
                    symbols ="5",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(5))}
                )

                CalculatorButton(
                    symbols ="6",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(6))}
                )

                CalculatorButton(
                    symbols ="-",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Orange)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Operation(CalculatorOperation.Sub))}
                )

            }

            /////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Row(
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                modifier = Modifier.fillMaxWidth()
            ) {

                CalculatorButton(
                    symbols ="1",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(1))}
                )

                CalculatorButton(
                    symbols ="2",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(2))}
                )

                CalculatorButton(
                    symbols ="3",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Number(3))}
                )

                CalculatorButton(
                    symbols ="+",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Orange)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Operation(CalculatorOperation.Add))}
                )

            }

            /////////////////////////////////////////////////////////////////////////////////////////////////////////////
            Row(
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                modifier = Modifier.fillMaxWidth()
            ) {

                CalculatorButton(
                    symbols ="0",
                    modifier =Modifier
                        .aspectRatio(2f)
                        .background(Color.DarkGray)
                        .weight(2f),
                    onClick = {onAction(CalculatorAction.Number(0))}
                )

                CalculatorButton(
                    symbols =".",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Color.DarkGray)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Decimal)}
                )

                CalculatorButton(
                    symbols ="=",
                    modifier =Modifier
                        .aspectRatio(1f)
                        .background(Orange)
                        .weight(1f),
                    onClick = {onAction(CalculatorAction.Calculate)}
                )

            }

        }
    }
}