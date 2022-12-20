package com.pcm.promsace.registrounico.controller;
import com.pcm.promsace.registrounico.model.GastoModel;
import com.pcm.promsace.registrounico.service.GastoDiarioService;
import com.pcm.promsace.registrounico.service.GastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/mef")
public class MefController {
    @Autowired
    private GastoService gastoService;
    @Autowired
    private GastoDiarioService gastoDiarioService;

    //http://localhost:3333/api/mef/gasto
    @PostMapping("gasto")
    public ResponseEntity<?> saveGasto(@RequestBody GastoModel gastoModel)
    {
        return new ResponseEntity<>(
                gastoService.saveGasto(gastoModel) ,
                HttpStatus.CREATED
        );
    }
    //http://localhost:3333/api/mef/gasto/10
    @DeleteMapping("gasto/{gastoId}")
    public ResponseEntity<?> deleteGasto(@PathVariable Long gastoId)
    {
        gastoService.deleteGasto(gastoId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    //http://localhost:3333/api/mef/gasto
    @GetMapping("gasto")
    public  ResponseEntity<?> getAllGasto()
    {
        return ResponseEntity.ok(gastoService.findAllGasto());
    }
    @GetMapping("gastoDiarioPorAnioMes/{anoEje}/{mesEje}/{page}/{size}")
    public ResponseEntity<?> getGastoDiarioPorAnioMes(@PathVariable Integer anoEje,@PathVariable Integer mesEje,@PathVariable Integer page,@PathVariable Integer size)
    {
        return ResponseEntity.ok(gastoDiarioService.findByYearMonth(anoEje,mesEje,page,size));
    }

}
