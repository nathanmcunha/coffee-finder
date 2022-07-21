package br.com.coffeefinder.domain.dto;

import java.util.HashMap;
import java.util.Locale.IsoCountryCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.geo.Point;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressDto {
  private String id;
  private String ufCode;
  private String countyCode;
  private String zipCode;
  private String addressName;
  private Point latitudeLongitude;
}
