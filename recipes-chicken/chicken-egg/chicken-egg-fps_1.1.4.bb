SECTION = "devel/chicken"
DESCRIPTION = "Functional PostScript"
LICENSE = "Free Use"
LIC_FILES_CHKSUM = "file://fps.meta;md5=ea422a022a557e149750ef368cc6ca98"
DEPENDS_append_class-cross = " chicken-egg-records-cross chicken-egg-format-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-records-crosssdk chicken-egg-format-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-records nativesdk-chicken-egg-format nativesdk-chicken-egg-regex chicken-egg-records-crosssdk chicken-egg-format-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-records chicken-egg-format chicken-egg-regex chicken-egg-records-cross chicken-egg-format-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-records chicken-egg-format chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/fps/fps-${PV}.tar.gz"

SRC_URI[md5sum] = "8743e094d6c08d66a5d1c170fbdb0c82"
SRC_URI[sha256sum] = "c20d7e5614c8047385368ae9e6f6336a5c33bcee6df24f4c98d99ff554e3b5b9"

S = "${WORKDIR}/fps-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
