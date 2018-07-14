package co.edu.uniajc.control;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import co.edu.dataaccess.dao.Archivo;
import co.edu.delegate.BusinessDelegatorView;
import co.edu.exceptions.ZMessManager;

@Service
public class ArchivoServiceImpl implements ArchivoService {

	@Value("${upload.dir}")
	private String uploadDir;

	@Autowired
	private BusinessDelegatorView businessDelegatorView;

	@Override
	public Object uploadFile(MultipartFile file) throws IOException {
		String fileName;
		if (!file.isEmpty()) {
			fileName = String.format("%s%s%s", uploadDir, File.separator, file.getOriginalFilename());
			try (BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(fileName)))) {
				byte[] bytes = file.getBytes();
				stream.write(bytes);
			}
			Archivo archivo = new Archivo();
			archivo.setNombre(file.getOriginalFilename());
			archivo.setExtension(archivo.getNombre().substring(archivo.getNombre().lastIndexOf('.')));
			archivo.setRuta(fileName);
			archivo.setFechaCreacion(new java.sql.Date(System.currentTimeMillis()));
			businessDelegatorView.saveGeneric(archivo);
			return archivo.getIdArchivo();
		} else {
			throw new ZMessManager.UploadException("Error al cargar el archivo");
		}
	}

}
