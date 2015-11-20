SECTION = "devel/chicken"
DESCRIPTION = "Library for using the eFax service to send faxes over the internet"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://efax.meta;md5=1984a0bc99b21a45da55a741641f7c1c"
DEPENDS_append_class-cross = " chicken-egg-http-client-cross chicken-egg-base64-cross chicken-egg-sxml-serializer-cross chicken-egg-ssax-cross chicken-egg-sxpath-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-http-client-crosssdk chicken-egg-base64-crosssdk chicken-egg-sxml-serializer-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-http-client nativesdk-chicken-egg-base64 nativesdk-chicken-egg-sxml-serializer nativesdk-chicken-egg-ssax nativesdk-chicken-egg-sxpath chicken-egg-http-client-crosssdk chicken-egg-base64-crosssdk chicken-egg-sxml-serializer-crosssdk chicken-egg-ssax-crosssdk chicken-egg-sxpath-crosssdk"
DEPENDS = " chicken-egg-http-client chicken-egg-base64 chicken-egg-sxml-serializer chicken-egg-ssax chicken-egg-sxpath chicken-egg-http-client-cross chicken-egg-base64-cross chicken-egg-sxml-serializer-cross chicken-egg-ssax-cross chicken-egg-sxpath-cross"
RDEPENDS_${PN} = " chicken-egg-http-client chicken-egg-base64 chicken-egg-sxml-serializer chicken-egg-ssax chicken-egg-sxpath"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/efax/efax-${PV}.tar.gz"

SRC_URI[md5sum] = "da458fca4527ee989a7b6e182ce7973d"
SRC_URI[sha256sum] = "85603b5698de79fbb63e546782d3662c3bb8bb67344fcc784d1a4278bea57306"

S = "${WORKDIR}/efax-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
