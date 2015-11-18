SECTION = "devel/chicken"
DESCRIPTION = "A TOML parser built with comparse"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://toml.meta;md5=39bbd4facbce7d8b37762c75baa32cd8"
DEPENDS_append_class-cross = " chicken-egg-numbers-cross chicken-egg-comparse-cross chicken-egg-rfc3339-cross chicken-egg-vector-lib-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-numbers-crosssdk chicken-egg-comparse-crosssdk chicken-egg-rfc3339-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-numbers nativesdk-chicken-egg-comparse nativesdk-chicken-egg-rfc3339 nativesdk-chicken-egg-vector-lib chicken-egg-numbers-crosssdk chicken-egg-comparse-crosssdk chicken-egg-rfc3339-crosssdk chicken-egg-vector-lib-crosssdk"
DEPENDS = " chicken-egg-numbers chicken-egg-comparse chicken-egg-rfc3339 chicken-egg-vector-lib chicken-egg-numbers-cross chicken-egg-comparse-cross chicken-egg-rfc3339-cross chicken-egg-vector-lib-cross"
RDEPENDS_${PN} = " chicken-egg-numbers chicken-egg-comparse chicken-egg-rfc3339 chicken-egg-vector-lib"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/toml/toml-${PV}.tar.gz"

SRC_URI[md5sum] = "7a386065f3ae8ef1cfc8ee222618e967"
SRC_URI[sha256sum] = "7f534eac239300155a1657212aefddd6ec39f85d8a87b6c5ac4a0af023fff4c1"

S = "${WORKDIR}/toml-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
