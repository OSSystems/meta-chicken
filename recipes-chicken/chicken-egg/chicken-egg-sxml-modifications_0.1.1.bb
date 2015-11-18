SECTION = "devel/chicken"
DESCRIPTION = "The sxml-modification bits of sxml-tools from the SSAX project at Sourceforge"
LICENSE = "PD"
LIC_FILES_CHKSUM = "file://sxml-modifications.meta;md5=791e8722d702e273db904f5ae5a90d6b"
DEPENDS_append_class-cross = " chicken-egg-sxpath-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sxpath-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sxpath chicken-egg-sxpath-crosssdk"
DEPENDS = " chicken-egg-sxpath chicken-egg-sxpath-cross"
RDEPENDS_${PN} = " chicken-egg-sxpath"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/sxml-modifications/sxml-modifications-${PV}.tar.gz"

SRC_URI[md5sum] = "3ec8bc0c478a724992a10dea2f389a66"
SRC_URI[sha256sum] = "4c06230d063a0668400ae87d45a76964f47a1853ba9f568c4a86fda137944af8"

S = "${WORKDIR}/sxml-modifications-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
