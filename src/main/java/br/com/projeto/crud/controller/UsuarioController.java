package br.com.projeto.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.crud.model.UsuarioModel;
import br.com.projeto.crud.repository.UsuarioRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping("/criar")
    public ResponseEntity<UsuarioModel> criarUsuario(@RequestBody UsuarioModel usuario) {
        UsuarioModel novoUsuario = usuarioRepository.save(usuario);
        return new ResponseEntity<> (novoUsuario, HttpStatus.CREATED);
    }
    
    @GetMapping("/listar")
    public ResponseEntity<List<UsuarioModel>> listarUsuarios(@RequestParam(required = false) String param) {
        List<UsuarioModel> usuarios = usuarioRepository.findAll();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }
    
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<HttpStatus> deleteUsuario(@PathVariable("id") long id) {
        usuarioRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity getUsuario(@PathVariable("id") long id) {
        Optional<UsuarioModel> usuario = usuarioRepository.findById(id);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity putUsuario(@PathVariable long id, @RequestBody UsuarioModel usuario) {
        Optional<UsuarioModel> novoUsuario = usuarioRepository.findById(id);
        UsuarioModel usuarioAtualizado = novoUsuario.get();
        usuarioAtualizado.setName(usuario.getName());
        usuarioAtualizado.setPassword(usuario.getPassword());
        usuarioAtualizado.setCpf(usuario.getCpf());
        usuarioAtualizado.setDataNascimento(usuario.getDataNascimento());
        return new ResponseEntity<>(usuarioRepository.save(usuarioAtualizado), HttpStatus.OK);
    } 

}
