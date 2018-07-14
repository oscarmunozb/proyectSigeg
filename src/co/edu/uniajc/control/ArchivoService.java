package co.edu.uniajc.control;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

public interface ArchivoService {

	Object uploadFile(MultipartFile file) throws IOException;

}
